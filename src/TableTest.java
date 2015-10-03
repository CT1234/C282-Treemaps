public class TableTest 
{
	public static void main(String[] args) throws TableException 
	{
		Table<Integer,Student> table = new Table<Integer, Student>();
		
		Student Bob   = new Student(1001,"Bob",  110,"Cheese Appreciation Studies");
		Student Joe   = new Student(1002,"Joe",  134,"Economics");
		Student Jaime = new Student(1003,"Jaime",150,"Anthrobiology");
		Student Robb  = new Student(1004,"Robb", 99, "Emotional Character studies");
		Student Cathy = new Student(1005,"Cathy",85, "Studies");
		Student Stan  = new Student(1006,"Stan", 200,"Masters in City Urban Planning");
		Student Bran  = new Student(1007,"Bran", 80, "PHD in Library Studies");
		Student Davos = new Student(1008,"Davos",90, "PHD In Car Washing");
		Student Arya  = new Student(1009,"Arya", 95, "Sword Fighting");
		Student John  = new Student(1010,"Jon",  110,"Snow Studies");

		System.out.println("TESTING DELETE STUDENT 1001: " + table.tableDelete(1001));	
		System.out.println("ORIGINAL TREE SIZE: " + table.size());	
		table.tableInsert(Bob.studentID,Bob);
		table.tableInsert(Joe.studentID,Joe);
		table.tableInsert(Jaime.studentID,Jaime);
		System.out.println("AFTER ADDING STUDENT ONE, TWO, THREE, TREE SIZE: " + table.size());
		System.out.println("TESTING DELETE STUDENT 1001: " + table.tableDelete(1001));	
		System.out.println("AFTER REMOVING STUDENT ONE, TREE SIZE: " + table.size());	
		System.out.println("RETRIVE VALUE FROM KEY 1002: " + table.tableRetrieve(1002));	
		System.out.println("RETRIVE VALUE FROM KEY 1012 (DOES NOT EXIST): " + table.tableRetrieve(1012));	
		table.tableInsert(Robb.studentID,Robb);
		table.tableInsert(Cathy.studentID,Cathy);
		table.tableInsert(Stan.studentID,Stan);
		table.tableInsert(Bran.studentID,Bran);
		System.out.println("ADDING four,five, six, seven:");
		try
		{
			table.tableInsert(Bran.studentID,Bran);
		}
		catch(TableException e)
		{
			System.out.println(e);
		}
		System.out.println("WHAT IS THE TREE SIZE: " + table.size());
		System.out.println("RETRIVE VALUE FROM KEY 1003: " + table.tableRetrieve(1003));	
		System.out.println("ADDING eight,nine, ten:");
		table.tableInsert(Davos.studentID,Davos);
		table.tableInsert(Arya.studentID,Arya);
		table.tableInsert(John.studentID,John);
		System.out.println("RETRIEVE TABLE TWO, NOT THE ADDRESS:" + table.tableRetrieve(1002).name);
		table.printTable();
		
		System.out.print("CHECK THAT SIZE IS SAME AFTER POLLFIRSTENTRY: " + table.size());
	}
}