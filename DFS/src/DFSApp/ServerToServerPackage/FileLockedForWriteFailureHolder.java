package DFSApp.ServerToServerPackage;

/**
 * DFSApp/ServerToServerPackage/FileLockedForWriteFailureHolder.java . Generated
 * by the IDL-to-Java compiler (portable), version "3.2" from DFS.idl Thursday,
 * November 29, 2018 11:00:20 AM EST
 */

public final class FileLockedForWriteFailureHolder implements org.omg.CORBA.portable.Streamable {
	public DFSApp.ServerToServerPackage.FileLockedForWriteFailure value = null;

	public FileLockedForWriteFailureHolder() {
	}

	public FileLockedForWriteFailureHolder(DFSApp.ServerToServerPackage.FileLockedForWriteFailure initialValue) {
		value = initialValue;
	}

	public void _read(org.omg.CORBA.portable.InputStream i) {
		value = DFSApp.ServerToServerPackage.FileLockedForWriteFailureHelper.read(i);
	}

	public void _write(org.omg.CORBA.portable.OutputStream o) {
		DFSApp.ServerToServerPackage.FileLockedForWriteFailureHelper.write(o, value);
	}

	public org.omg.CORBA.TypeCode _type() {
		return DFSApp.ServerToServerPackage.FileLockedForWriteFailureHelper.type();
	}

}
