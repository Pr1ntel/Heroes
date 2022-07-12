package com.company;
public class Main {

    public static void main(String[] args) {

        Unit wizard = new Wizard(20,10,"Wiz1",0,1,50, BattlefieldMap.FieldCell.WIZ);
        Unit warrior = new Warrior(50,15,"War1",5,1);

        wizard.Attack(warrior);

        if(wizard.Attack(warrior)){
            BattlefieldMap battlefieldMap;
        }

        System.out.println(warrior.getAsString());

        Unit gremlin = new Gremlin(30,15,"Gremlin",0,1,BattlefieldMap.FieldCell.GREM);
        Unit archer = new Archer(20,20,"Archer",0,1,10, BattlefieldMap.FieldCell.ARCH);

        BattlefieldMap battlefieldMap = new BattlefieldMap();
        battlefieldMap.BattlefieldMap();

// WorkersManger wm = new WorkersManger();
// wm.p1();
//
// Worker worker = new Worker();
// worker.p3();
//
// ChildClass childClass = new ChildClass();
// childClass.p1();
// childClass.p2();

// Unit wizard = new Wizard(10, 20, "wiz1", 3);
// Unit archer = new Archer(3, 50, "ar1", 10);
//
// System.out.println(wizard.getAsString());
// System.out.println(archer.getAsString());
//
// //wizard.Attack(archer);
//
// archer.Attack(wizard);
//
// System.out.println(wizard.getAsString());
// System.out.println(archer.getAsString());

// ArrayList<Unit> units = new ArrayList<>();
// units.add(new Wizard(10, 20, "wiz1", 3,1,50));
// units.add(new Archer(3, 50, "ar1", 10,1,20));
// units.add(new Warrior(20,10,"War1",5,1));

// for (int i = 0; i < units.size(); i++) {
// System.out.println(units.get(i).getAsString());
    }
}
