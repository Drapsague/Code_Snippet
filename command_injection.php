<?php
$userInput = 'ls';
$cmd = escapeshellcmd($userInput);
$output = shell_exec($cmd); 
echo htmlentities($output);
?>

