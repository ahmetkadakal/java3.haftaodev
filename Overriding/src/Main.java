
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {
				new OgretmenKrediManagaer(),
				new OgrenciKrediManager(),
				new TarımKrediManager()
				
		};
		//final yaparsan ovveride edilemez
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));
		}

	}

}
