package org.cloudfoundry.samples.music.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlbumTest {
	
	Album album;
	
	//String title, String artist, String releaseYear, String genre

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		album = new Album("title", "artist", "releaseYear", "genre");;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testAlbum() {
		assertNotNull(album);
	}

	@Test
	public final void testGetTitle() {
		String title = album.getTitle();
		assertEquals(title, "title");
	}

	@Test
	public final void testSetTitle() {
		album.setTitle("title");
		assertEquals(album.getTitle(), "title");
	}

	@Test
	public final void testGetArtist() {
		String artist = album.getArtist();
		assertEquals(artist, "artist");
	}

	@Test
	public final void testSetArtist() {
		album.setArtist("artist");
		assertEquals(album.getArtist(), "artist");
	}

	@Test
	public final void testGetReleaseYear() {
		String releaseYear = album.getReleaseYear();
		assertEquals(releaseYear, "releaseYear");
	}

	@Test
	public final void testSetReleaseYear() {
		album.setReleaseYear("releaseYear");
		assertEquals(album.getReleaseYear(), "releaseYear");
	}

	@Test
	public final void testGetGenre() {
		String genre = album.getGenre();
		assertEquals(genre, "genre");
	}

	@Test
	public final void testSetGenre() {
		album.setGenre("genre");
		assertEquals(album.getGenre(), "genre");
	}


}
