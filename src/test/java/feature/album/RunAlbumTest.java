package feature.album;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


import org.cloudfoundry.samples.music.domain.Album;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:out"}, snippets=SnippetType.CAMELCASE)
public class RunAlbumTest {
	
}
