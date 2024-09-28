class Java_version
{
	public static void main(String arg[])
	{
		System.out.println("Java Version:" +System.getProperty("java.version"));
		System.out.println("Java Runtime Version:" +System.getProperty("java.runtime.version"));
		System.out.println("Java Home:" +System.getProperty("java.home"));
		System.out.println("Java Vender:" +System.getProperty("java.vender"));
		System.out.println("Java Vender URL:" +System.getProperty("java.vender.url"));
		System.out.println("Java ClassPath:" +System.getProperty("java.class.path") + "\n");
	}
}