

//Q: 다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?


public class QnA01 {
    public static void main(String[] args){
        int var1=5;
        int var2=2;
        double var3=var1/var2;
        int var4=(int)(var3*var2);
        System.out.println(var4);
    }
}


//A: 실수형 변수인 double 까지만 봤을 땐 var1/var2 를 하였을 시 2.5 가 출력이 될 텐데,
//그 다음 줄에서 실수형 변수가 아닌 정수형 변수 int 를 사용함으로써 var3 이 2.5 가 아닌
//소수점을 뺀 정수 2 까지만 저장하였기 때문에 var3*var2 의 값은 4 가 나오게 된다!