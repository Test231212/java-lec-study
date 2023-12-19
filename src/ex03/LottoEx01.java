package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {

        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }

    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(45) + 1; // 1부터 45까지의 난수 생성
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--; // 중복된 숫자가 있으면 다시 생성
                    break;
                }
            }
        }
        Arrays.sort(numbers); // 번호를 오름차순으로 정렬
        return numbers;
    }
}