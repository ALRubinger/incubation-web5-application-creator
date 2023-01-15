/**
 * 
 */
package website.tbd.web5.creator.backend.api.git;

/**
 * Indicates a specified organization does not exist
 * 
 * @author <a href="mailto:alr@tbd.email">Andrew Lee Rubinger</a>
 *
 */
public class NoSuchOrganizationException extends IllegalArgumentException {

	private static final long serialVersionUID = -2020738941676778513L;

	/**
	 * @param message
	 */
	public NoSuchOrganizationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
