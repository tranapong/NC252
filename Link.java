package th.ac.utcc.cpe.Tanapong;

/**@Tanapong_Ruengwattanawisit_5907101019
 */

public class Link {
	 public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class

