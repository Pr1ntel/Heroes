package com.company;

public enum FieldCell {
    MAPPOINT('*'),
    WAR('W'),
    ORC('O'),
    WIZ('Z'),
    ARCH('A'),
    GREM('G');

    FieldCell(int value) {
        this.value = value;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void BattlefieldMap(FieldCell fieldCell) {
        int masStr = 7; // длина
        int masHeight = 10; // высота
        BattlefieldMap.FieldCell[][] gameField = new BattlefieldMap.FieldCell[masStr][masHeight];
        gameField = new BattlefieldMap.FieldCell[masStr][masHeight]; // ВЫВОД МАПЫ ДЛЯ ИГРЫ
        for (int i = 0; i < masStr; i++) {
            for (int j = 0; j < masHeight; j++) {
                gameField[i][j] = BattlefieldMap.FieldCell.MAPPOINT;
            }
        }
        for (int i = 0; i < masStr; i++) {
            for (int j = 0; j < masHeight; j++) {
                System.out.print(gameField[i][j].getValue());
            }
            System.out.println();
        }

        gameField[0][1] = BattlefieldMap.FieldCell.WAR;

    }

}
