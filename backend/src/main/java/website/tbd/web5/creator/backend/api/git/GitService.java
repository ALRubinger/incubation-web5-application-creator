/**
 * 
 */
package website.tbd.web5.creator.backend.api.git;

import java.nio.file.Path;

/**
 * API for Git operations upon a backing provider.
 * 
 * @author <a href="mailto:alr@tbd.email">Andrew Lee Rubinger</a>
 *
 */
public interface GitService {

	/**
	 * Creates a repository with the given information (name and description). The
	 * repository will be created by default with no homepage, issues, wiki, or
	 * downloads, and will be public.
	 *
	 * @param organization   - the {@link GitOrganization} to create this repository
	 * @param repositoryName - the name of the repository
	 * @param description    - the repository description
	 * @return the created {@link GitRepository}
	 * @throws NoSuchOrganizationException if the logged-in user does not belong to
	 *                                     the organization or the organization does
	 *                                     not exist
	 */
	GitRepository createRepository(GitOrganization organization, String repositoryName, String description)
			throws IllegalArgumentException;

	/**
	 * Creates a repository with the given information (name and description). The
	 * repository will be created by default with no homepage, issues, wiki,
	 * downloads, and will be public.
	 *
	 * @param repositoryName - the name of the repository
	 * @param description    - the repository description
	 * @return the created {@link GitRepository}
	 * @throws IllegalArgumentException If the fields were not specified
	 */
	GitRepository createRepository(String repositoryName, String description) throws IllegalArgumentException;

	/**
	 * Pushes to a repository. All files specified by the {@link Path} will be added
	 * and pushed.
	 *
	 * @param repository - the repository to push to
	 * @param path       - the directory containing the files to be added and pushed
	 * @throws IllegalArgumentException
	 */
	void push(GitRepository repository, Path path) throws IllegalArgumentException;

}
