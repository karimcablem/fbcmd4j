import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Friend;
import facebook4j.Post;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;

public class Login {
	public static void main(String[] args) throws FacebookException {
		Facebook facebook = new FacebookFactory().getInstance();

		facebook.setOAuthAppId("1066536996877003", "ec30ff2be302fefb66b0e8bfaab86e41");
		facebook.setOAuthPermissions("email,publish_stream");
		facebook.setOAuthAccessToken(new AccessToken("EAASqt8BZCXGkBAA0Y7xj1ApmWILmvQEZCqCoSv94bu3shyk3NA8C08N4Pok6h3Ew1ScGyEddoehVnxHUXndZAZAOQO7WTA25ZB3FoyhfwX5KwprMI8pRm0q7dWGHrnZA6drHP4wFIk1jeaPJ7ml0RQUn8xFDMZCNrZAJ7qJ1CZAKZAjRNAwCtHvMD5I6juv0davOtSA3vEPuJk0LEKiEWxxZCJBEXv0aJLk47ZASxkkHlxXUWQZDZD", null));
		ResponseList<User> results = facebook.search();
		
		for(Object us:results) {
			System.out.println((User)us);
		}

	}
}

