import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class GetFeeds {
	public static void main(String[] args) throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();

		facebook.setOAuthAppId("1066536996877003", "ec30ff2be302fefb66b0e8bfaab86e41");
		facebook.setOAuthPermissions("email,publish_stream,");
		facebook.setOAuthAccessToken(new AccessToken("EAAPKAn7WsssBAHZBZBZAo9z0PXiXU9ohVDtuQk47oNCrednwCHLTE4EUOgkLytISNxbmclPWepCEBnhXhzQejAnQzBuZAprbCaAbOzCB4X1Wi5mZALtWdhJU7Rc72ZAtLB9W5LB36ARTfZClxJ2g17JDODlexQv2URl9Y5O06LWgvbvDKoDi5kt9TLJNrMDKPJXbx9ROeAIZA2UmgAsL50ZApZBGSrGhwYqtBdxaDgMCJDSQZDZD", null));
		
		System.out.println(facebook.callGetAPI("/me"));

		System.out.println("\tGetting my posts\n");
		ResponseList feed = facebook.getPosts();
		
		for (Object post : feed) {
		    System.out.println(post);
		}
		
	

	}
}
