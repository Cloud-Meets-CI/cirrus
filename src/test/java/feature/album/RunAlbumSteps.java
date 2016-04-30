package feature.album;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.cloudfoundry.samples.music.domain.Album;

import cucumber.api.Format;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RunAlbumSteps {
	Album album;

	// "title" "artist" "releaseYear" "genre"
	@Given("^New Album \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void newAlbum(String title, String artist, String releaseYear, String genre, String description) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		album = new Album(title, artist, releaseYear, genre, description);;
	}

	@When("^Add Album$")
	public void addAlbum() throws Throwable {
		System.out.println(album.toString());
	}

	@Then("^Album added$")
	public void albumAdded() throws Throwable {
		System.out.println(album.toString());
	}
	

}
