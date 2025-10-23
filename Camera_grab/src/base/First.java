package base;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
public class First {

	public static void main(String[] args) {


	

		
		        // Create a FrameGrabber for the default webcam (device number 0)
		        FrameGrabber grabber = new OpenCVFrameGrabber(0);
		        grabber.start();

		        // Create a CanvasFrame to display the webcam feed
		        CanvasFrame canvas = new CanvasFrame("Webcam Feed");
		        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

		        // Continuously grab frames and display them
		        while (canvas.isVisible() && (grabber.grab() != null)) {
		            canvas.showImage(grabber.grab());
		        }

		        // Release resources
		        grabber.stop();
		        canvas.dispose();
		    }
		}

	}

}
