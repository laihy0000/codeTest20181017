/**
 * FizzBuzz code test
 * create by laihy, 2018-10-17
 */

public class CodeTest {

    private static final int FizzNum = 3;
    private static final int BuzzNum= 5;

    public void outputFunction(Integer max){
        if(max == null){
            return;
        }
        for(int i=1; i<=max ; ++i){
            Boolean fizz = divisibleBy(i,FizzNum);
            Boolean buzz = divisibleBy(i,BuzzNum);
            if(fizz && !buzz){
                System.out.println("Fizz");
            }else if(!fizz && buzz){
                System.out.println("Buzz");
            }else if(fizz && buzz){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public void outputFunctionStage2(Integer max){
        if(max == null){
            return;
        }
        for(int i=1; i<=max ; ++i){
            Boolean fizz = divisibleBy(i,FizzNum) || containNum(i,FizzNum);
            Boolean buzz = divisibleBy(i,BuzzNum) || containNum(i,BuzzNum);
            if(fizz && !buzz){
                System.out.println("Fizz");
            }else if(!fizz && buzz){
                System.out.println("Buzz");
            }else if(fizz && buzz){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public Boolean divisibleBy(Integer num, Integer div){
        if(num == null || div == null){
            return false;
        }
        if(div == 0){
            return false;
        }
        if(num % div == 0){
            return true;
        }
        return false;
    }

    public Boolean containNum(Integer num, Integer target){
        if(num == null || target == null){
            return false;
        }
        String numStr = String.valueOf(num);
        String targetStr = String.valueOf(target);
        if(numStr.contains(targetStr)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CodeTest codeTest = new CodeTest();
        codeTest.outputFunction(100);
        codeTest.outputFunctionStage2(100);
    }
}



