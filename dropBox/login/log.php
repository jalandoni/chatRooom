<?php
ini_set("display_errors",1);
session_start();
require_once "config.php";

$email = $_POST["email"];
$pw = md5($_POST["password"]);
$sql = "SELECT * from accounts where password = '".md5($pw).' and email = '$email'";
if ($link->query($sql) === true) { //if query is successful 
    echo 1;
} else { 
    echo "error : " . mysqli_error($link);
}
// exit;
$link->close(); //disconnect from db