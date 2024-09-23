import processing.core.PApplet;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }
// This method is used to define the size of the window.
public void settings() {
    size(800, 600); // Set the window size to 800x600
}

// This method runs once when the program starts.
public void setup() {
    background(173, 216, 230); // Set the background color to light blue (RGB: 173, 216, 230)
}

// This is where the program draws each frame.
public void draw() {
    // You can add drawing code here later if needed.
    fill(255); // Set the fill color to white
    rect(50, 50, 200, 100); // Draw a rectangle at (50, 50) with a width of 200 and a height of 100
}

    


}
