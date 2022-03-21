package DFSApp.ServerToServerPackage;

/**
 * DFSApp/ServerToServerPackage/FileNotFoundFailureHelper.java . Generated by
 * the IDL-to-Java compiler (portable), version "3.2" from DFS.idl Thursday,
 * November 29, 2018 11:00:20 AM EST
 */

abstract public class FileNotFoundFailureHelper {
	private static String _id = "IDL:DFSApp/ServerToServer/FileNotFoundFailure:1.0";

	public static void insert(org.omg.CORBA.Any a, DFSApp.ServerToServerPackage.FileNotFoundFailure that) {
		org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
		a.type(type());
		write(out, that);
		a.read_value(out.create_input_stream(), type());
	}

	public static DFSApp.ServerToServerPackage.FileNotFoundFailure extract(org.omg.CORBA.Any a) {
		return read(a.create_input_stream());
	}

	private static org.omg.CORBA.TypeCode __typeCode = null;
	private static boolean __active = false;

	synchronized public static org.omg.CORBA.TypeCode type() {
		if (__typeCode == null) {
			synchronized (org.omg.CORBA.TypeCode.class) {
				if (__typeCode == null) {
					if (__active) {
						return org.omg.CORBA.ORB.init().create_recursive_tc(_id);
					}
					__active = true;
					org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember[1];
					org.omg.CORBA.TypeCode _tcOf_members0 = null;
					_tcOf_members0 = org.omg.CORBA.ORB.init().create_string_tc(0);
					_members0[0] = new org.omg.CORBA.StructMember("reason", _tcOf_members0, null);
					__typeCode = org.omg.CORBA.ORB.init().create_exception_tc(
							DFSApp.ServerToServerPackage.FileNotFoundFailureHelper.id(), "FileNotFoundFailure",
							_members0);
					__active = false;
				}
			}
		}
		return __typeCode;
	}

	public static String id() {
		return _id;
	}

	public static DFSApp.ServerToServerPackage.FileNotFoundFailure read(org.omg.CORBA.portable.InputStream istream) {
		DFSApp.ServerToServerPackage.FileNotFoundFailure value = new DFSApp.ServerToServerPackage.FileNotFoundFailure();
		// read and discard the repository ID
		istream.read_string();
		value.reason = istream.read_string();
		return value;
	}

	public static void write(org.omg.CORBA.portable.OutputStream ostream,
			DFSApp.ServerToServerPackage.FileNotFoundFailure value) {
		// write the repository ID
		ostream.write_string(id());
		ostream.write_string(value.reason);
	}

}
