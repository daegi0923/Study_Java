
public class SpiderMan extends Person{// is a
	boolean isSpider;
	
	//has a 관계
	Spider spider; // reference type => null
	public SpiderMan() {
		this.spider = new Spider();
	}
	void fireWeb() {
		if(isSpider) {
			spider.fireWeb();
		}
		else {
			System.out.println("지금은 안됨.");
		}
		System.out.println("어떻게?");
	}
}
