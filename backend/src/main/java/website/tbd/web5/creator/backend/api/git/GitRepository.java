/**
 * 
 */
package website.tbd.web5.creator.backend.api.git;

import java.net.URI;

/**
 * Value object representing a Git repository
 * 
 * @author <a href="mailto:alr@tbd.email">Andrew Lee Rubinger</a>
 *
 */
public interface GitRepository {

    /**
     * @return the full repository name in form "owner/repoName"
     */
    String getFullName();

    /**
     * @return the github.com page for the repository
     */
    URI getHomepage();

    /**
     * @return the {@link URI} to use to clone the project from GitHub
     */
    URI getGitCloneUri();
	
}
