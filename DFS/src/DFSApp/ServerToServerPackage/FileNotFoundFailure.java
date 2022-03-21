package DFSApp.ServerToServerPackage;

/**
 * DFSApp/ServerToServerPackage/FileNotFoundFailure.java . Generated by the
 * IDL-to-Java compiler (portable), version "3.2" from DFS.idl Thursday,
 * November 29, 2018 11:00:20 AM EST
 */

public final class FileNotFoundFailure extends org.omg.CORBA.UserException {
	public String reason = null;

	public FileNotFoundFailure() {
		super(FileNotFoundFailureHelper.id());
	} // ctor

	public FileNotFoundFailure(String _reason) {
		super(FileNotFoundFailureHelper.id());
		reason = _reason;
	} // ctor

	public FileNotFoundFailure(String $reason, String _reason) {
		super(FileNotFoundFailureHelper.id() + "  " + $reason);
		reason = _reason;
	} // ctor

} // class FileNotFoundFailure
