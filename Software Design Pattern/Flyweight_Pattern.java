import java.util.HashMap;
import java.util.Map;


// =====================================================
// Flyweight Interface
// =====================================================
// Defines the operation for the shared tree object.

interface TreeType {

    void display(int x, int y);
}


// =====================================================
// Concrete Flyweight
// =====================================================
// Stores the shared/intrinsic data of a tree.
//
// This information is common for many trees.

class Tree implements TreeType {

    private String name;
    private String color;
    private String texture;


    // Constructor
    public Tree(String name, String color, String texture) {

        this.name = name;
        this.color = color;
        this.texture = texture;
    }


    // Display the tree
    // x and y are unique/extrinsic data.
    @Override
    public void display(int x, int y) {

        System.out.println( name + " Tree | Color: " + color + " | Texture: " + texture + " | Position: (" + x + ", " + y + ")" );
    }
}


// =====================================================
// Flyweight Factory
// =====================================================
// Creates and manages shared Tree objects.
//
// If a TreeType already exists, it returns the existing
// object instead of creating a new one.

class TreeFactory {

    private static Map<String, TreeType> treeTypes =  new HashMap<>();


    public static TreeType getTreeType(
            String name,
            String color,
            String texture) {

        // Create a unique key
        String key = name + color + texture;


        // Check whether the object already exists
        if (!treeTypes.containsKey(key)) {

            System.out.println("Creating new Tree object: " + key );

            treeTypes.put( key,new Tree(name, color, texture));
        }


        // Return existing or newly created object
        return treeTypes.get(key);
    }
}


// =====================================================
// Main Class
// =====================================================

public class Main {

    public static void main(String[] args) {

        // Create / get Oak tree type
        TreeType oak = TreeFactory.getTreeType( "Oak","Green","OakTexture.png");


        // Create / get Oak tree type again
        TreeType oak2 = TreeFactory.getTreeType("Oak", "Green", "OakTexture.png" );


        // Create / get Pine tree type
        TreeType pine = TreeFactory.getTreeType( "Pine", "Dark Green", "PineTexture.png" );


        System.out.println();


        // Display trees at different positions
        oak.display(10, 20);

        oak2.display(50, 100);

        pine.display(80, 150);

        oak.display(200, 300);
    }
}