package Thread_3;

public class MulThreadDownTest {
		private final static String[] URL_PATH = {
		"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577206365012&di=58f45c46ef78c13b398752e9d9d8a27a&imgtype=0&src=http%3A%2F%2Fbpic.588ku.com%2Felement_origin_min_pic%2F16%2F11%2F23%2F5da0955fef491971bb76206080279fa1.jpg",
		"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577206365012&di=234f870777231827f1e98290acd2fd5d&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20170212%2F6a7823d0e06d42a7b1c85f3dd81b7ad0_th.jpg",
		"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577206365012&di=fb875adb228635f7265abea4651b8cb5&imgtype=0&src=http%3A%2F%2Fimg.caixin.com%2F2014-03-24%2F1395633851186812.jpg",
		"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577206365011&di=45ebef3435ac76cf7fde7bb25a53a780&imgtype=0&src=http%3A%2F%2Fpic.51yuansu.com%2Fpic3%2Fcover%2F03%2F28%2F84%2F5b7d549e18b8a_610.jpg",
		"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1577206365011&di=48643abbcb872616342228f328021fcc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201812%2F21%2F20181221123302_ChaKn.jpeg"
		};
		public static void main(String[] args) {
			for(int i=0; i<5; i++) {
				DownResourceTask task = new DownResourceTask(URL_PATH[i]);
				Thread th = new Thread(task,"download task"+i);
				th.start();
			}
	}
}
