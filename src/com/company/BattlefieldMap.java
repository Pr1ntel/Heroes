package com.company;

public class BattlefieldMap {

    public enum FieldCell {

        MAPPOINT('*'),
        WAR('W'),
        ORC('O'),
        WIZ('Z'),
        ARCH('A'),
        GREM('G');

        private char value;

        FieldCell(char value) {
            this.value = value;
        }

        public char getValue() {
            return value;
        }
    }

    public void BattlefieldMap() {
        int masStr = 7; // длина
        int masHeight = 10; // высота
        FieldCell[][] gameField = new FieldCell[masStr][masHeight];
        gameField = new FieldCell[masStr][masHeight]; // ВЫВОД МАПЫ ДЛЯ ИГРЫ
        for (int i = 0; i < masStr; i++) {
            for (int j = 0; j < masHeight; j++) {
                gameField[i][j] = FieldCell.MAPPOINT;
            }
        }

        gameField[0][1] = FieldCell.WIZ;
        gameField[0][3] = FieldCell.WIZ;
        gameField[0][5] = FieldCell.WIZ;
        gameField[0][7] = FieldCell.WIZ;
        gameField[0][9] = FieldCell.WIZ;

        gameField[1][1] = FieldCell.WAR;
        gameField[1][3] = FieldCell.WAR;
        gameField[1][5] = FieldCell.WAR;
        gameField[1][7] = FieldCell.WAR;
        gameField[1][9] = FieldCell.WAR;

        for (int i = 0; i < masStr; i++) {
            for (int j = 0; j < masHeight; j++) {
                System.out.print(gameField[i][j].getValue());
            }
            System.out.println();
        }

    }

}