package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        inputWord(scanner, dictionary);
        System.out.println();
        searchWord(scanner, dictionary);
    }

    private static void inputWord(Scanner scanner, Map<String, String> dictionary) {
        System.out.println("==단어 입력 단계==");
        while(true){
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = scanner.nextLine();
            if(eng.equals("q")) break;
            System.out.print("한글 뜻을 입력하세요: ");
            String kor = scanner.nextLine();

            pushWord(eng, kor, dictionary);
        }
    }

    private static void searchWord(Scanner scanner, Map<String, String> dictionary) {
        System.out.println("==단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String eng = scanner.nextLine();
            if(eng.equals("q")) break;

            if(dictionary.containsKey(eng)){
                System.out.println(eng + "의 뜻: " + dictionary.get(eng));
            }else{
                System.out.println(eng + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }

    private static void pushWord(String eng, String kor, Map<String, String> dictionary) {
        dictionary.put(eng, kor);
    }
}
