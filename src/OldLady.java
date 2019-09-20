/***
 * Grading Comments:
 *  Excellent job.  The use of print instead of println and
 *  in method  there() was exactly the innovation we're 
 *  looking for in reducing the text.
 *  Compiles and runs: 15/15
 *  Desired output:  6/6
 *  Consistency:  2/2  
 *  Economy:  2/2.  You could take it a step further by 
 *   nesting your methods - calling methods from methods,
 *   eg. a method called 'addSpider()' that calls the
 *   other methods that add the spider to the song - 
 *   and perhaps the main function could do with some
 *   comments, or at least spacing to break of the verses.
 *   25/25
 */ 
public class OldLady {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		there();
		System.out.println("fly.");
		oldladyfly();
		System.out.println();
		there();
		System.out.println("spider,\nThat wriggled and iggled and jiggled inside her.");
		swallowed1();
		oldladyfly();
		System.out.println("");
		there();
		System.out.println("bird,\nHow absurd to swallow a bird.");
		swallowed2();
		swallowed1();
		oldladyfly();
		System.out.println("");
		there();
		System.out.println("cat,\nImagine that to swallow a cat.");
		swallowed3();
		swallowed2();
		swallowed1();
		oldladyfly();
		System.out.println("");
		there();
		System.out.println("dog,\nWhat a hog to swallow a dog.");
		swallowed4();
		swallowed3();
		swallowed2();
		swallowed1();
		oldladyfly();
		System.out.println("");
		there();
		System.out.println("horse,\nShe died of course.");
	}
	public static void oldladyfly() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	public static void there() {
		System.out.print("There was an old lady who swallowed a ");
	}
	public static void swallowed1() {
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void swallowed2() {
		System.out.println("She swallowed the bird to catch the spider,");
	}
	public static void swallowed3() {
		System.out.println("She swallowed the cat to catch the bird,");
	}
	public static void swallowed4() {
		System.out.println("She swallowed the dog to catch the cat,");
	}
}
