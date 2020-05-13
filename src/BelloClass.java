/**
 *  <b>Bello</b>
 * <P>4AI</P>
 * <UL>
 * <LI>Bellomet<p>
 * </UL>
 * @author Bello Federico
 */
public class BelloClass {
    /**
     * costruttore
     * BelloClass
     */
public BelloClass() {
	
}
/**
*
* @return valore BelloMet
* 
*/
	public float BelloMet (int b, int e) {
		int val1=1; 		
			for (int i=1; i<=b; i++){
				val1 = val1 * b;
			}
			return val1;
		}  
    /**
    *
    * @return valore toString
    */
	@Override
	public String toString() {
		return "BelloClass []";
	}
    /**
    *
    * CLASSE main
    */
	public static void main(String[] args) {
		BelloClass b=new BelloClass();
		System.out.println(b.BelloMet(0,0));
		System.out.println(b);
	}
}
