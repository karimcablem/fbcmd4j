import java.net.MalformedURLException;
import java.net.URL;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class SetPost {
	public static void main(String[] args) throws FacebookException, MalformedURLException {
		Facebook facebook = new FacebookFactory().getInstance();

		facebook.setOAuthAppId("1066536996877003", "ec30ff2be302fefb66b0e8bfaab86e41");
		facebook.setOAuthPermissions("email,publish_stream,publish_to_groups");
		facebook.setOAuthAccessToken(new AccessToken("EAAPKAn7WsssBAHZBZBZAo9z0PXiXU9ohVDtuQk47oNCrednwCHLTE4EUOgkLytISNxbmclPWepCEBnhXhzQejAnQzBuZAprbCaAbOzCB4X1Wi5mZALtWdhJU7Rc72ZAtLB9W5LB36ARTfZClxJ2g17JDODlexQv2URl9Y5O06LWgvbvDKoDi5kt9TLJNrMDKPJXbx9ROeAIZA2UmgAsL50ZApZBGSrGhwYqtBdxaDgMCJDSQZDZD", null));
		
		System.out.println(facebook.callGetAPI("/me"));

		facebook.postLink(new URL("https://facebook4j.github.io"));
		
		PostUpdate pu= new PostUpdate("Hello world desde Facebook java");
		
		facebook.postFeed(pu);
	

	}
}
