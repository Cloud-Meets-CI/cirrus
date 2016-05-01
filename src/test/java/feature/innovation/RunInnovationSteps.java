package feature.innovation;

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

public class RunInnovationSteps {
	Album album;

	// "Cloud Application" "Nehal Gandhi" "04/30/2016" "Cloud Ready" "Cloud Integration"
	// String title, String artist, String releaseYear, String genre, String description
	@Given("^Create Innovation \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
	public void createInnovation(String title, String artist, String releaseYear, String genre, String description) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		album = new Album(title, artist, releaseYear, genre, description);
	}

	@When("^Create Innovation Item$")
	public void createInnovationItem() throws Throwable {
		System.out.println("Create Innovation Item: " + album.getTitle());
	}

	@Then("^Innovation Item Created$")
	public void innovationItemCreated() throws Throwable {
		System.out.println("Innovation Item created: " + album.getTitle());
	}
	
	String title;
	@Given("^Delete Innovation \"(.*?)\"$")
	public void deleteInnovation(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.title = title;
	}

	@When("^Delete Innovation Item$")
	public void deleteInnovationItem() throws Throwable {
		System.out.println("Delete Innovation Item: " + this.title);
	}

	@Then("^Innovation Item Deleted$")
	public void innovationItemDeleted() throws Throwable {
		System.out.println("Innovation Item deleted: " + this.title);
	}

	@Given("^Search Innovation \"(.*?)\"$")
	public void searchInnovation(String title) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.title = title;
	}

	@When("^Search Innovation Item$")
	public void searchInnovationItem() throws Throwable {
		System.out.println("Search Innovation Item: " + this.title);
	}

	@Then("^Innovation Item Found$")
	public void innovationItemFound() throws Throwable {
		System.out.println("Innovation Item Found: " + this.title);
	}

}
