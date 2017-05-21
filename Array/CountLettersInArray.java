public class CountLettersInArray
/*生成一堆随机小写字母,并统计每个字母出现的次数
JAVA语言编程设计第10版,P221
这个程序让我:
0.学习一个贼6的算法(至少写这个程序时的我觉得很厉害)
1.学习了char字符的unicode运算相关
2.略微掌握了用Math.random获得自己需要的随机数据的一些方法
*/
{
    public static void main(String[] args){
        
        char[] letters_array = createArray();
        System.out.println("所有字母");
        displayArray(letters_array);

        int[] counts = countsLetters(letters_array);
        System.out.println("\n计算结果");
        displayResult(counts);
    }
    public static char[] createArray(){
        /*
        创建一个数组,随机包含a-z的字母共一百个,并返回
        */
        char[] letters_array = new char[100];
        for (int bit=0;bit<letters_array.length;bit++)
        {
            letters_array[bit] = getRandomCharacter('a','z');
        }
        return letters_array;
    }
    public static char getRandomCharacter(char ch1,char ch2){
        /*获取ch1到ch2间的随机unicode字符*/
        char result;
        result = (char)(ch1 + Math.random()*(ch2 -ch1 + 1));
        return result;
    }
    public static void displayArray(char[] letters_array){
        
        for(char letter:letters_array){
            System.out.print(letter + " ");
        }
    }
    public static void displayArray(int[] nums){
        
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
    public static int[] countsLetters(char[] letters_array){
        /*
        这里的算法让我震惊了...从书上看到的
        */
        int[] counts = new int[26];
        for (int bit = 0;bit<letters_array.length;bit++)
        {
            /*
            必须详细说明!免得自己忘了!
            假如[letters_array[bit]为a
            那么a的unicode减去a的unicode就是0
            正好让0号元素自增,记录a
            假如[letters_array[bit]为b,
            那么b-a = 1,这样的话,让这1号元素自增,记录b
            以此类推,这做法太特么6了!自愧不如!
            */
            counts[letters_array[bit] - 'a']++;
        }
        return counts;
    }
    public static void displayResult(int[] counts){
        /*
        显示最终的结果
        */
        for (int index = 0;index<counts.length ;index++ )
        {
            char letter = (char)((int)'a' + index);
            System.out.print(letter + "有" + counts[index] + "个 ");
        }
    }
}