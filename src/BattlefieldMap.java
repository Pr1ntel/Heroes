public class BattlefieldMap {
    public void BattlefieldMap() {
        int masStr = 7; // длина
        int masHeight = 10; // высота
        int battlefieldMap[][] = new int[masStr][masHeight];            // ВЫВОД МАПЫ ДЛЯ ИГРЫ
        for (int i = 0; i < masStr; i++) {
            for (int j = 0; j < masHeight; j++) {
                System.out.print(battlefieldMap[i][j]);
            }
            System.out.println();
        }
    }
}



