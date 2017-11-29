package windowCtrl;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.Programm;


public class Controller {
	@FXML
	MediaPlayer mediaPlayer;
	@ FXML
	Label title;
	
	@FXML
	private void browse(){
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		fileChooser.getExtensionFilters().add(new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"));
		File file = fileChooser.showOpenDialog(Programm.stage);
	    title.setText(file.getName());
		Media hit = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(hit);
		
	}
	@FXML
	private void play(){
		mediaPlayer.play();
	}
	@FXML
	private void pause(){
		mediaPlayer.pause();
	}
	@FXML
	private void stop(){
		mediaPlayer.stop();
	}
	@FXML
	private void quit(){
		System.exit(0);
	}
		
}