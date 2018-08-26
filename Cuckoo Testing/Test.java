class Test{
public static void main(String[] args){
	    
		TestCuckoo4 t=new TestCuckoo4();
		t.cityData();
		System.out.println("enter start and end node");
		t.mainPaths(t.sc.nextInt(),t.sc.nextInt());
		System.out.println(t.path +"\n"+ t.pathWeight(t.path));
		System.out.println(t.sequence +"\n"+ t.sequenceWeight());
		t.generate();
	}
}