use strict;
use ElectricCommander;
 
# Turn off buffering
$| = 1;
 
# Create an ElectricCommander object to communicate with a server.
my $ec = new ElectricCommander({server=>'commander5'});
$ec->login('admin','changeme');
 
createProject();

sub createProject { 
      $ec->createProject("ImmersionProject");
      $ec->createProcedure("ImmersionProject", "ImmersionProcedure");
      $ec->createStep("ImmersionProject", "ImmersionProcedure", "ImmersionStep", {subproject => "EC-HelloWorld-1.0.0.0", subprocedure => "sayHello"}); }
