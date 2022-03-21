package DFSApp;

/**
 * DFSApp/_ClientToServerStub.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from DFS.idl Thursday, November 29, 2018 11:00:20
 * AM EST
 */

public class _ClientToServerStub extends org.omg.CORBA.portable.ObjectImpl implements DFSApp.ClientToServer {

	public String sayHello() {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("sayHello", true);
			$in = _invoke($out);
			String $result = $in.read_string();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return sayHello();
		} finally {
			_releaseReply($in);
		}
	} // sayHello

	public int openFileForRead(String fileTitle) throws DFSApp.ClientToServerPackage.FileNotFoundFailure {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("openFileForRead", true);
			$out.write_string(fileTitle);
			$in = _invoke($out);
			int $result = $in.read_long();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			if (_id.equals("IDL:DFSApp/ClientToServer/FileNotFoundFailure:1.0"))
				throw DFSApp.ClientToServerPackage.FileNotFoundFailureHelper.read($in);
			else
				throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return openFileForRead(fileTitle);
		} finally {
			_releaseReply($in);
		}
	} // openFileForRead

	public String readFromFile(int fileID, int location, int length) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("readFromFile", true);
			$out.write_long(fileID);
			$out.write_long(location);
			$out.write_long(length);
			$in = _invoke($out);
			String $result = $in.read_string();
			return $result;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			return readFromFile(fileID, location, length);
		} finally {
			_releaseReply($in);
		}
	} // readFromFile

	public void closeFile(int fileID) {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("closeFile", false);
			$out.write_long(fileID);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			closeFile(fileID);
		} finally {
			_releaseReply($in);
		}
	} // closeFile

	public void shutdown() {
		org.omg.CORBA.portable.InputStream $in = null;
		try {
			org.omg.CORBA.portable.OutputStream $out = _request("shutdown", false);
			$in = _invoke($out);
			return;
		} catch (org.omg.CORBA.portable.ApplicationException $ex) {
			$in = $ex.getInputStream();
			String _id = $ex.getId();
			throw new org.omg.CORBA.MARSHAL(_id);
		} catch (org.omg.CORBA.portable.RemarshalException $rm) {
			shutdown();
		} finally {
			_releaseReply($in);
		}
	} // shutdown

	// Type-specific CORBA::Object operations
	private static String[] __ids = { "IDL:DFSApp/ClientToServer:1.0" };

	public String[] _ids() {
		return (String[]) __ids.clone();
	}

	private void readObject(java.io.ObjectInputStream s) throws java.io.IOException {
		String str = s.readUTF();
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
		try {
			org.omg.CORBA.Object obj = orb.string_to_object(str);
			org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate();
			_set_delegate(delegate);
		} finally {
			orb.destroy();
		}
	}

	private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
		String[] args = null;
		java.util.Properties props = null;
		org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, props);
		try {
			String str = orb.object_to_string(this);
			s.writeUTF(str);
		} finally {
			orb.destroy();
		}
	}
} // class _ClientToServerStub
