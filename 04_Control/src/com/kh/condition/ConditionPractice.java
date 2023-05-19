package com.kh.condition;
import java.util.*;
import java.text.*;


public class ConditionPractice {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ConditionPractice cp = new ConditionPractice();
//		cp.practice1();
//		cp.practice2(10,2);
		cp.practice3();
//		cp.practice4();		
		cp.practice5();
//		cp.practice6();
//		cp.practice7();
//		cp.practice8();
//		cp.practice9();
//		cp.practice10();
		cp.practice11();
	}
	
	
	
    /*
       키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
       짝수가 아니면 “홀수다“를 출력하세요.
       양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
    
       숫자를 한 개 입력하세요 : -8
       양수만 입력해주세요.
     */
    public void practice1() {
    	System.out.print("정수 > ");
        int num = sc.nextInt();
        if( num <= 0)
        	System.out.println("양수만 입력해 주세욤 ~");
        else
        {
        	if(num %2 != 0)
        	{
        		System.out.println("홀수");
        	}
        	else
        		System.out.println("짝수");        		
        }
        	
        
    	
    }

    /*
        정수 num1과 num2가 매개변수로 주어진다. 두 수가 같으면 1 다르면 -1을 출력하세요.

        num1 : 2
        num2 : 3
        -1

        num1 : 11
        num2 : 11
        1
     */
    public void practice2(int num1, int num2) {
    	if(num1 != num2)
    	{
    		System.out.println(-1);
    		return;
    	}
    	
    	System.out.println(1);
        
    }

    /*
        A 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라준다.
        피자 조각 수와 피자를 먹는 사람의 수를 입력받아 한 사람 당 최소 한 조각 이상 피자를 먹으려면 
        최소 몇 판의 피자를 시켜야 하는지 출력하세요.

        피자 조각 수 : 7
        피자 먹는 사람 수 : 10
        2

     */
    public void practice3() {
    	System.out.print("피자 조각수 > ");
    	int piece = sc.nextInt();
    	System.out.print("사람 수 > ");
    	int person = sc.nextInt();

//    	if(piece % person > 0)
//    		System.out.println(person/piece + 1);
    	
    	// 딱 떨어졌을 때! 만약 피자 조각 수가 4, 사람 수가 8! 요럴 때 어떨지 생각해보면 좋을 것 같아요~~
    	
    	//------------------------------------------------------------
    	// re)
    	// -> 아.. 어떻게 출력 되어야 하는지 나오다 보니까 과정을 생각해서 짰어야 했는데 정답에 끼워 
    	//		맞추는 형식으로 짠것 같아 뭔가 창피하네요 ㅋㅋㅋㅋㅋㅋㅋㅋ;;
    	// 
    	// 사람이 더 많아서 피자판수가 더 많이 필요한 경우와, 피자가 더 많아서 있는 판수만큼만 출력해 주면 되는
    	// 부분으로 분기 나눠서 다시 처리 했습니다 ㅠㅠ
    	// 그리고 말씀해 주셨듯이 나머지가 0인경우 즉, 딱 배수만큼 필요한 경우도
    	// if문 안에서 분기처리 한번 더 해서 정리했습니다.
    	if(person > piece)
    	{
    		if(person%piece != 0)
    			System.out.println(person/piece + 1);
    		else
    			System.out.println(person/piece);
    	}
    	else
    	{
    		System.out.println((int)piece/person);
    	}
    	//---------------------------------------------------------------
    }

    /*
        국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
        합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
        (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
        합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
        불합격인 경우에는 “불합격입니다.”를 출력하세요.
    
        국어점수 : 88 
        수학점수 : 50 
        영어점수 : 40 
        불합격입니다.

        국어점수 : 88
        수학점수 : 50
        영어점수 : 45
        국어 : 88
        수학 : 50
        영어 : 45
        합계 : 183
        평균 : 61.0
        축하합니다, 합격입니다!
     */
    public void practice4() {
    	System.out.print("국어 > ");
    	int kor = sc.nextInt();
    
    	System.out.print("수학 > ");
    	int math = sc.nextInt();
    	
    	System.out.print("영어 > ");
    	int eng = sc.nextInt();
    	if( kor < 40 || eng < 40 || math < 40)
    	{
    		System.out.println("불합격입니다~");
        	return;
    	}
    		
    	int total = kor + eng + math;
    	float avg = total / 3.0f;
    	System.out.printf("총 점 > %d\n", total);
    	System.out.printf("평 균 > %.1f\n", avg);
    	
    	if(avg < 60.0f)    		
    		System.out.println("불합격입니다~");
    	else
    		System.out.println("합격입니다, 축하해용 !");
    
    
    }

    /*
        B 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만원 이상 사면 20%를 할인해준다.
        구매한 옷의 가격을 입력했을 때, 지불해야 할 금액을 출력하세요.
        
        구매한 옷 가격 : 580,000
        464,000
     */
    public void practice5() {
    	System.out.print("옷 가격 > ");
    	int price = sc.nextInt();
    	int saleStandard = 100000; 
    	
    	if(price < saleStandard){
    		//10만원 미만.
    	}
    	if(price < saleStandard * 3) // 요렇게 되면 30만원 이상이면 10%가 아닌 5%
    	{
    		// 10만원 이상 ~ 30만원미만.    	
    		price *= 0.95f;
    	}
    	else if(price < saleStandard * 5) // 50만원 이상이면 10%  ----> 뭔가 빼먹었다는 거 보이시나요?
    	{// 30만원 이상 ~ 50만원미만.
    		price *= 0.9f;
    	}
    	else
    	{// 50만원이상
    		price *= 0.8f;
    	}
    	
    	DecimalFormat df = new DecimalFormat("###,###"); // 역시! 해보실 분들은 해보라고 해놓은거였어요 :)
    	String formatMoney = df.format(price);
    	System.out.println(formatMoney);
    }


    /*
        각에서 0도 초과 90도 미만은 예각, 90도는 직각, 90도 초과 180도 미만은 둔각 180도는 평각으로 분류한다.
        입력받은 각에 따라 예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4를 출력하세요.
     */
    public void practice6() {
    	System.out.print("각도? > ");
    	int angle = sc.nextInt();
    	
    	// 90
    	if(angle == 90){
    		System.out.println(2);
    	}
    	// 180
    	else if(angle == 180) {
    		System.out.println(4);
    	}
    	//예각
    	else if(angle < 90) {
    		System.out.println(1);
    	}
    	//직각
    	else if(angle < 180)
    	{
    		System.out.println(3);
    	}
    	else
    		System.out.println("0~180까지만..");
    	
    }


    /*
      아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
      로그인 성공 시 “로그인 성공”, 
      아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
      비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.

      아이디 : happy
      비밀번호 : 1234
      로그인 성공!
 
      아이디 : happy
      비밀번호 : 23467
      비밀번호가 틀렸습니다.

      아이디 : happy222
      비밀번호 : 1234
      아이디가 틀렸습니다.
    */
    public void practice7() 
    {
    	String id = "happy";
    	String pass = "1234";
    	System.out.print("ID > ");
    	String inputId = sc.next();
    	System.out.print("PASS > ");
    	String inputPass = sc.next();
    	
    	if(!id.equals(inputId))
    	{
    		System.out.println("아이디가 틀렸습니다.");
    	}
    	else if(!pass.equals(inputPass))
    	{
    		System.out.println("비밀번호가 틀렸습니다.");
    	}
    	else
    	{
    		System.out.println("로그인 성공 ~");
    	}
    }

    /*
        키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
        저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
        BMI = 몸무게 / (키(m) * 키(m))
        BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
        BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
        BMI가 30이상일 경우 고도 비만

        키(m)를 입력해 주세요 : 1.62
        몸무게(kg)를 입력해 주세요 : 46
        BMI 지수 : 17.527815881725342
        저체중

     */
    public void practice8() {
    	System.out.print("키(m) > ");
    	double height = sc.nextDouble();
    	System.out.print("몸무게(kg) > ");
    	double weight = sc.nextDouble();
    	String str = "";
    	
    	double bmi = weight / (height * height);
    	System.out.printf("BMI > %f\n", bmi);
    	if(bmi < 18.5)
    		str = "저체중";
    	else if(bmi < 23)
    		str = "정상체중";
    	else if(bmi < 25)
    		str = "과체중";
    	else if(bmi < 30)
    		str = "비만";
    	else
    		str = "고도비만;";
		System.out.println(str);  	
    	
    }

    /*
        키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
        (단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산 기호를 입력 했을 시
        “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력)

        피연산자1 입력 : 15
        피연산자2 입력 : 4
        연산자를 입력(+,-,*,/,%) : /
        15 / 4 = 3

     */
    public void practice9() {
    	
    	List<String> operatorTemp = new ArrayList<String>()
    	{
			{add("+");
			add("-");
			add("/");
			add("%");
			add("*");}
		};
    	
    	System.out.print("피연산자1 > ");
    	int num1 = sc.nextInt();
    	System.out.print("피연산자2 > ");
    	int num2 = sc.nextInt();
    	// execp check
    	if(num1 <= 0 || num2 <= 0)
    	{
    		System.out.println("잘못 입력하셨어요, 프로그램을 종료합니다.");
    		return;
    	}
    	
    	System.out.print("연산자를 입력(+,-,*,/,%) > ");
    	String operator = sc.next();
    	// execp check
    	if(!operatorTemp.contains(operator))
    	{
    		System.out.println("잘못 입력하셨어요, 프로그램을 종료합니다.");
    		return;
    	}
    	
    	int result = 0;
    	switch(operator)
    	{
    	case "+":
    		result = num1 + num2;
    		break;
	 	case "-":
	 		result = num1 - num2;
    		break;
	 	case "*":
	 		result = num1 * num2;
			break;
	 	case "/":
	 		result = num1 / num2;
			break;
	 	case "%":
	 		result = num1 % num2;
			break;
    	}
    	System.out.printf("%d %s %d = %d\n", num1, operator, num2, (int)result);
    }

    /*
      아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
      종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요

        1. 입력
        2. 수정
        3. 조회
        4. 삭제
        9. 종료
        메뉴 번호를 입력하세요 : 3
        조회 메뉴입니다.
     */
    public void practice10() {
       System.out.print("1.입력\n2.수정\n3.조회\n4.삭제\n9.종료\n메뉴 번호를 입력하세요 > ");
       int num = sc.nextInt();
       String str = "";
       
       switch(num)
       {
       case 1:
    	   str = "입력";
    	   break;
       case 2:
    	   str = "수정";
    	   break;
       case 3:
    	   str = "조회";
    	   break;
       case 4:
    	   str = "삭제";
    	   break;
       case 9:
    	   str = "종료";
    	   break;
       default:
    	   str = "프로그램이 종료됩니다.";
    	   System.out.println(str);
    	   return;
       }
       
       System.out.println(str + " 메뉴입니다.");
    	   
       
    }

    /*
        중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
        총 점 100점 중 배점으로는 다음과 같다.
        중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%)

        이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력

        총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass,
        아니면 Fail을 출력하세요.


        중간 고사 점수 : 80
        기말 고사 점수 : 90
        과제 점수 : 50
        출석 회수 : 15
        ===========결과==========
        중간 고사 점수(20) : 16.0
        기말 고사 점수(30) : 27.0
        과제 점수 (30) : 15.0
        출석 점수 (20) : 15.0
        총점 : 73.0
        PASS

        중간 고사 점수 : 80
        기말 고사 점수 : 30
        과제 점수 : 60
        출석 회수 : 18
        ===========결과==========
        FAIL [점수 미달] (총점 61.0)

        중간 고사 점수 : 90
        기말 고사 점수 : 100
        과제 점수 : 80
        출석 회수 : 13
        ===========결과==========
        FAIL [출석 횟수 부족] (13/20)

        중간 고사 점수 : 100
        기말 고사 점수 : 80
        과제 점수 : 40
        출석 회수 : 10
        ===========결과==========
        FAIL [출석 횟수 부족] (10/20)
        FAIL [점수 미달] (총점 66.0)

     */
    public void practice11() {
        
    	System.out.print("중간고사 점수 > ");
    	int midScore = sc.nextInt();
    	
    	System.out.print("기말고사 점수 > ");
    	int lastScore = sc.nextInt();
    	
    	System.out.print("과제 점수 > ");
    	int assignmentScore = sc.nextInt();
    	
    	System.out.print("출석 회수 > ");
    	int atsExchange = sc.nextInt();
    	
    	
    	float msExchange = (midScore * 0.2f);
    	float lsExchange = (lastScore * 0.3f);
    	float asExchange = (assignmentScore * 0.3f);
    	
    	float total = (msExchange + lsExchange + asExchange + atsExchange);
    	System.out.println("===========결과==========");
    	
    	// 굳이 맨마지막 처럼 뽑아야 하면 if문을 이중으로 넣어야 할 수 밖에 없는것 같아서 일단 짜긴 했는데..
    	// 혹시나 조금 더 좋은 방법이나 가독성이나 최적화 방법이 있다면 조금 더 고민해 보겠습니다;	
    	
    	// ---> 이 문제는 이게 정답! 사실 귀찮게 해놓은 문제에요 :) else if, else를 알게 되면 대부분 if문만 사용한 방식이 더 낫다는 걸 잊을 때도 있어서
    	// 충분히 잘하셨습니다!
    	
    	// re) 어쩐지 출석이 부족해서 부족하다고 나오고 점수가 미달되도 표시가 되서 뭔가 찜찜해서 주석을 달았는데 답변 감사합니다.:)
	   	if(total < 70.0f || atsExchange < 20 *0.7f)
    	{    		 
	   		if(total < 70.0f)   
	   			System.out.printf("FAIL [점수 미달] (총점 %.1f)\n", total);
	   		
	   		if(atsExchange < 20 *0.7f)
	   			System.out.printf("FAIL [출석 횟수 부족] (%d/20)", atsExchange);
      	}   
	   	else
    	{
	    	System.out.printf("중간 고사 점수(20): %.1f\n",msExchange );
	    	System.out.printf("기말 고사 점수(30): %.1f\n",lsExchange );
	    	System.out.printf("과제 점수(30): %.1f\n", asExchange );
	    	System.out.printf("출석 점수(20): %.1f\n", (float)atsExchange );
	    	System.out.printf("총점 : %.1f\n",total );
	    	System.out.print("PASS");
	    	
    	}

    	
    }
    
}