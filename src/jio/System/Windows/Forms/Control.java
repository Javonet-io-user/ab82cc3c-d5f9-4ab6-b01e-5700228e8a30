package jio.System.Windows.Forms;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.ComponentModel.*;
import jio.System.Windows.Forms.*;
import jio.System.*;

public class Control extends NControlContainer
    implements IComponent,
        IDisposable,
        IDropTarget,
        ISynchronizeInvoke,
        IWin32Window,
        IBindableComponent {
  protected NObject javonetHandle;

  public Control() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control");
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", text);
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", text, left, top, width, height);
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(Control parent, java.lang.String text) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Windows.Forms.Control", parent, text);
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(
      Control parent,
      java.lang.String text,
      java.lang.Integer left,
      java.lang.Integer top,
      java.lang.Integer width,
      java.lang.Integer height) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("System.Windows.Forms.Control", parent, text, left, top, width, height);
      super.construct(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Control(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
    try {
      super.construct(handle);
    } catch (JavonetException e) {
      e.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragEnter(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragEnter", drgEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragLeave(EventArgs e) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragLeave", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragDrop(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragDrop", drgEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void OnDragOver(DragEventArgs drgEvent) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Windows.Forms.IDropTarget")
          .invoke("OnDragOver", drgEvent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
