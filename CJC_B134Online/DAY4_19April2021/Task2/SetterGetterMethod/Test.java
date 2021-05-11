public class Test
{
	public static void main(String args[])
	{
		Hostel h = new Hostel();
		h.setRoomno(228);
		h.setStudentname("srushti");
		h.setStudentweight(50.0f);
		h.setYear(2021);
		
		System.out.println(h.getRoomno());
		System.out.println(h.getStudentname());
		System.out.println(h.getStudentweight());
		System.out.println(h.getYear());
	}
}
