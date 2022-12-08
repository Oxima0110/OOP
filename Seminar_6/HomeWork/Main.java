package Seminar_6.HomeWork;

public class Main {
    public static void main(String[] args){
		User user = new User("Bob");
		Report report = new ReportConsole();
		Persister persister = new Persister(user);
		report.report(user);
		persister.save();
	}
}
