-- Add alarm fieldALTER TABLE notes ADD COLUMN alarm LONG DEFAULT null;-- Create new table for attachmentsCREATE	TABLE attachments	(		id INTEGER PRIMARY KEY AUTOINCREMENT,		uri TEXT,		note_id INTEGER	);