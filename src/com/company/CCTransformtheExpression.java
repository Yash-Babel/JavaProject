package com.company;

import java.util.Scanner;
import java.util.Stack;

public class CCTransformtheExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack<Character> st=new Stack<>();
        while (t-- > 0) {
            int b=0,v=0,ss=0,start;         //bracket( count,variables at the end count,stack size count;ss have no use although
            String str=sc.next();
            String answer="";
            start=str.charAt(0)=='('?1:0;
            for(int i=start;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'){        //((a+b)*(z+x))
                    if(v>=b+2){
                        answer+=ch;
                        b--;
                        v=0;
                    }else{
                        st.push(ch);
                        ss++;
                    }
                }else if(ch=='('){
                    b++;
                }else if(ch==')'){
                    answer+=st.pop();
                    b--;
                    v=0;
                    ss--;
                }else{
                    answer+=ch;
                    v++;
                }
            }
            System.out.println(answer);
        }
    }
}
