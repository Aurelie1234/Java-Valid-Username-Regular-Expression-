class UsernameValidator {
/*
* Write regular expression here.
*/
Scanner scan = new Scanner(System.in);
String userName = scan.nextLine();
String user_pattern = "^[a-zA-Z0-9]([_])|[a-zA-Z0-9]){8,30}[a-zA-Z0-9]$";
Pattern pattern = Pattern.compile(user_pattern);
Matcher m = pattern.matcher(userName);
return m.matches();
}
