<?php
$pdo = new PDO('sqlite::memory:');
$pdo->exec("CREATE TABLE users (id INT, name TEXT)");

$name = "admin";
$stmt = $pdo->prepare("SELECT * FROM users WHERE name = ?");
$stmt->execute([$name]); 
?>

