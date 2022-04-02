public class Game {
    public static void main(String[] args) {
        System.out.println("2.Игра “Угадай число”");
        int srcNum = 100;
        int srcNumPrev = 100;
        int y = 99;
        srcNum /= 2;
        while ((srcNumPrev - srcNum) / 2 > 1) {
            System.out.print(srcNum);
             if (srcNum > y) {
                System.out.print(" данное число больше того, что загадал компьютер\n");
                srcNum = srcNum - (srcNumPrev - srcNum) / 2;
                srcNumPrev /= 2;
            } else if (srcNum < y) {
                System.out.print(" данное число меньше того, что загадал компьютер\n");
                srcNum = srcNum + (srcNumPrev - srcNum) / 2;
            } else if (srcNum == y) {
                break;
            }
        }
        while (srcNum != y) {
            System.out.print(srcNum);
            if (srcNum > y) {
                System.out.print(" @данное число больше того, что загадал компьютер\n");
                srcNum -= 1; 
            } else if (srcNum < y) {
                System.out.print(" #данное число меньше того, что загадал компьютер\n");
                srcNum += 1;
            }
        } 
        System.out.print(srcNum);
        System.out.print(" Вы победили!");
    }   
}