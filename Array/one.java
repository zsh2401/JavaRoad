public class one{
    public static void main(String[] args){
        int[] nums = {1,7,8,0,2};
        ArrayTest at = new ArrayTest();
        //at.printLength();
        //at.printSet();
        /*
        int result = at.findMax(nums);
        System.out.println(result);
        */

        /*计算和
        System.out.println(at.compNum(nums));
        */
        //at.test1();
        //at.foreachTest();


        /*左移数组
        for(int num :nums){
            System.out.print("  " + num);
        }
        nums = at.moveLeft(nums);
        System.out.println("");
        for(int num :nums){
            System.out.print("  " + num);
        }
        */

        
        //at.foreachTest(at.arrayCopy2(nums));

        
        

    }
}

class ArrayTest
{
    int[] arrayCopy(int[] nums){
        /*用循环的方法复制数组*/
        int[] new_nums = new int[nums.length];
        for (int bit=0;bit<nums.length;bit++ )
        {
            new_nums[bit] = nums[bit];
        }
        return new_nums;
    }
    int[] arrayCopy2(int[] nums){
        int[] new_nums = new int[nums.length];
        System.out.println("被复制前 : ");
        foreachTest(new_nums);
        System.arraycopy(nums,0,new_nums,0,nums.length);
        System.out.println("\n被复制后 : ");
        return new_nums;
    }
    int[] moveLeft(int[] nums){
        int[] array_temp = new int[nums.length];//临时数组
        for (int bit_=1;bit_<nums.length;bit_ ++)//遍历
        {
            /*将原始数组的x位设为临时数组的x-1位
            实现左移动数组元素
            */
            array_temp[bit_ - 1] = nums[bit_];
        }
        //将最后一位元素设置为原数组开头
        array_temp[array_temp.length-1] = nums[0];

        nums = array_temp;
        return nums;
    }
    void foreachTest(){
        /*
        foreach是一个简便的for循环
        与python的for循环差不多!
        */
        int nums[] = {1,3,5,7,9};
        
        for(int num:nums){
            /*
            这个for循环可以读作对nums中的每个元素num进行以下操作
            */
            System.out.print(num);
        }
    }
    void foreachTest(int[] nums){
        /*
        接收参数的foreach
        */
        
        for(int num:nums){
            System.out.print(num + "  ");
        }
    }
    void test1(){
        int x =30;
        int[] nums = new int [x];
        x = 60;
        System.out.println(nums.length);
    }
    void printLength(){
        /*打印一个数组的长度*/
        int[] ages = new int[]{1,3,5,7,9};
        System.out.println(ages.length);//打印数组的长度
    }
    void printSet(){
        /*用for循环给数组赋值*/
        int length = 18;//定义长度
        int[] numsL18 = new int[length];//创建一个该长度的空数组
        int num = 0;//要设定的数字
        for (int c=0;c<length;c++ )//for循环
        {
            num += 15;
            numsL18[c] = num;
            System.out.println(numsL18[c]);
        }
    }

    int findMax(int[] nums){
     /*寻找传入的数组最大值*/
        int max_num = 0;
        for (int c = 0;c< nums.length;c++ )
        {
            if (nums[c]>max_num)
            {
                max_num = nums[c];
            }
        }
        return max_num;
    }
    int findMax(){
    /*如果不传入数组则自定义一个数字寻找最大值..*/
        int[] nums = {1,3,5,7,9,11,12,254,123,25139,123232,668,923};
        int max_num = 0;
        for (int c = 0;c< nums.length;c++ )
        {
            if (nums[c]>max_num)
            {
                max_num = nums[c];
            }
        }
        return max_num;
    }
    int compNum(int[] nums){
        /*计算数组中的所有数字相加的和并返回*/
        int result = 0;
        for (int c = 0;c<nums.length;c++ )
        {
            result += nums[c];
        }
        return result;
    }
}