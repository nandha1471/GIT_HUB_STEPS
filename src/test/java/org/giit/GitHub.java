package org.giit;

public class GitHub {
	
	private void gitInitiation() {

	String gitStart = " git config --global user.email gitemailID"
			+         " git config --global user.name gitusername"
			+         " git init"
			+         " git status"
			+         " git add ."
			+         " git commit -m your message "
			+         " git remote -v"
			+         " git remote remove origin"
			+         " git remote add origin https://token@github.com/username/repositoryname.git"
			+         " git push -u origin master";
	}
	private void gitCloning() {

		String gitclone = " Create a folder in local or desktop"
				+         " BASH HERE Using Right Click"
				+         " git clone URL from repository"
				+         " In eclipse file->import->select the folder created--> finish"
				+         " the clone will be imported";


}
}