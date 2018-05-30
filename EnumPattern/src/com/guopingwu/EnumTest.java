package com.guopingwu;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level level = Level.HIGH;
		int levelCode =0;

        switch (level) {
            case HIGH:
                System.out.println("level = " + level);
                levelCode = level.getLevelCode();
                System.out.println("Level Code = " + levelCode);
                break;
            case MEDIUM:
                System.out.println("This is MEDIUM");
                levelCode = level.getLevelCode();
                System.out.println("Level Code = " + levelCode);
                break;
            case LOW:
                System.out.println("This is LOW");
                levelCode = level.getLevelCode();
                System.out.println("Level Code = " + levelCode);
                break;
            default:
                throw new AssertionError("Unknown LEVEL " + level);

        }
        
        System.out.print("NO loop Level.values () = : " + Level.values().toString() + "\n");
        System.out.print("No loop Level.values () = : " + Level.LOW+ "\n");
        
        
        for (Level l : Level.values()) {
        	System.out.print("For loop Level: " + l + "\n");
        	//System.out.print("For loop Level.values () = : " + Level.values() + "\n");

        	if (l.getLevelCode() >= 3) {
        			System.out.print("For loop Level is HIGHT \n");
        	} else if (l.getLevelCode() == 2) {
        			System.out.print("For loop Level is Medium \n");
        	} else {
        		System.out.print("For loop Level is Low \n");
        	}
        }
	}

}
