
public class Formatter {
	public static void main(String[] args) {
		// 数字を出力(10進数)
        System.out.println(String.format("%d", 123));
        
        // 数字を出力 (8進数)
        System.out.println(String.format("%o", 123));
        
        // 数字を出力 (16進数)
        System.out.println(String.format("%x", 123));
        
        // 0埋め
        System.out.println(String.format("%05d", 123));
        
        // 文字列
        System.out.println(String.format("%sは、%sです", "これ", "テスト"));
        
        // 文字列 (引数の番号を指定)
        System.out.println(String.format("%3$s, %2$s, %1$s", "a", "b", "c"));
        
        // 日付 (yyyy-MM-dd)
        System.out.println(String.format("%tF", new java.util.Date()));
	}
}
