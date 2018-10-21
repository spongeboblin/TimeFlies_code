// Generated code from Butter Knife. Do not modify!
package it.feio.android.omninotes;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DetailFragment$$ViewBinder<T extends it.feio.android.omninotes.DetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131820769, "field 'root'");
    target.root = finder.castView(view, 2131820769, "field 'root'");
    view = finder.findRequiredView(source, 2131820774, "field 'title'");
    target.title = finder.castView(view, 2131820774, "field 'title'");
    view = finder.findRequiredView(source, 2131820784, "field 'content'");
    target.content = finder.castView(view, 2131820784, "field 'content'");
    view = finder.findRequiredView(source, 2131820777, "field 'attachmentsAbove'");
    target.attachmentsAbove = finder.castView(view, 2131820777, "field 'attachmentsAbove'");
    view = finder.findRequiredView(source, 2131820778, "field 'attachmentsBelow'");
    target.attachmentsBelow = finder.castView(view, 2131820778, "field 'attachmentsBelow'");
    view = finder.findOptionalView(source, 2131820783, null);
    target.mGridView = finder.castView(view, 2131820783, "field 'mGridView'");
    view = finder.findRequiredView(source, 2131820735, "field 'locationTextView'");
    target.locationTextView = finder.castView(view, 2131820735, "field 'locationTextView'");
    view = finder.findRequiredView(source, 2131820779, "field 'timestampsView'");
    target.timestampsView = view;
    view = finder.findRequiredView(source, 2131820785, "field 'reminder_layout'");
    target.reminder_layout = finder.castView(view, 2131820785, "field 'reminder_layout'");
    view = finder.findRequiredView(source, 2131820786, "field 'reminderIcon'");
    target.reminderIcon = finder.castView(view, 2131820786, "field 'reminderIcon'");
    view = finder.findRequiredView(source, 2131820787, "field 'datetime'");
    target.datetime = finder.castView(view, 2131820787, "field 'datetime'");
    view = finder.findRequiredView(source, 2131820771, "field 'titleCardView'");
    target.titleCardView = view;
    view = finder.findRequiredView(source, 2131820776, "field 'scrollView'");
    target.scrollView = finder.castView(view, 2131820776, "field 'scrollView'");
    view = finder.findRequiredView(source, 2131820780, "field 'creationTextView'");
    target.creationTextView = finder.castView(view, 2131820780, "field 'creationTextView'");
    view = finder.findRequiredView(source, 2131820781, "field 'lastModificationTextView'");
    target.lastModificationTextView = finder.castView(view, 2131820781, "field 'lastModificationTextView'");
    view = finder.findRequiredView(source, 2131820772, "field 'titleWrapperView'");
    target.titleWrapperView = view;
    view = finder.findRequiredView(source, 2131820773, "field 'tagMarkerView'");
    target.tagMarkerView = view;
    view = finder.findRequiredView(source, 2131820770, "field 'detailWrapperView'");
    target.detailWrapperView = finder.castView(view, 2131820770, "field 'detailWrapperView'");
    view = finder.findRequiredView(source, 2131820782, "field 'snackBarPlaceholder'");
    target.snackBarPlaceholder = view;
  }

  @Override public void unbind(T target) {
    target.root = null;
    target.title = null;
    target.content = null;
    target.attachmentsAbove = null;
    target.attachmentsBelow = null;
    target.mGridView = null;
    target.locationTextView = null;
    target.timestampsView = null;
    target.reminder_layout = null;
    target.reminderIcon = null;
    target.datetime = null;
    target.titleCardView = null;
    target.scrollView = null;
    target.creationTextView = null;
    target.lastModificationTextView = null;
    target.titleWrapperView = null;
    target.tagMarkerView = null;
    target.detailWrapperView = null;
    target.snackBarPlaceholder = null;
  }
}
